/*
   Record Audit Data Library RAD_01
   Copyright (C) 2022  Suomen Kanuuna Oy
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
   http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.teragrep.rad_01;

import java.lang.reflect.InvocationTargetException;

public final class AuditPluginFactory {
    private final String auditPluginClassName;

    public AuditPluginFactory(String auditPluginClassName) {
        this.auditPluginClassName = auditPluginClassName;
    }

    public AuditPlugin getAuditPlugin() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return instanceOf(AuditPlugin.class);
    }

    private <T> T instanceOf(Class<T> aInterface) throws
            ClassNotFoundException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
            SecurityException {
        T result = null;

        // unavoidable cast
        Class<? extends T> implClass = (Class<? extends T>) Class.forName(auditPluginClassName);
        result = implClass.getDeclaredConstructor().newInstance();

        if (result == null) {
            throw new InstantiationException(
                    "The interface " + aInterface.getName() + " has no mapping to an impl."
            );
        }
        return result;
    }

}
