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


public final class DefaultAuditPlugin implements AuditPlugin {

    @Override
    public void audit(long unixEpoch, byte[] message, byte[] index, byte[] sourcetype, byte[] hostname, byte[] input, String partition, long offset) {

    }

    @Override
    public void setQuery(String query) {

    }

    @Override
    public void setReason(String reason) {

    }

    @Override
    public void setUser(String user) {

    }
}
