/*******************************************************************************
 * Copyright (c) 2015 Low Latency Trading Limited  :  Author Richard Rose
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at	http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,  software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.rr.core.properties;

import com.rr.core.utils.SMTRuntimeException;

public interface DynamicConfig {

    /**
     * invoked post configuration to ensure component has all required properties
     * 
     * @throws SMTRuntimeException
     */
    public void validate() throws SMTRuntimeException;

    /**
     * @return string of key properties in the config
     */
    public String info();
}