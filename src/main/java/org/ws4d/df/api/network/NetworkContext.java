/**
 * Copyright (C) 2014 PipesBox UG (haftungsbeschränkt) (elmar.zeeb@pipesbox.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ws4d.df.api.network;

import java.util.logging.Logger;

public interface NetworkContext {

	/**
	 * This method returns the unique id of this network
	 * 
	 * @return id of the network
	 */
    public String getNetworkId();

    /**
     * This methods returns a network property
     *
     * @param key key of propterty
     * @return value of propterty
     */
    public Object getNetworkProperty(String key);

    /**
     * This methods sets a network property
     *
     * @param key key of property
     * @param object value of property
     */
    public void setNetworkProperty(String key, Object property);

    /**
     * This methods returns a runtime property related to a network
     *
     * @param key key of property
     * @return value of property
     */
    public Object getRuntimeProperty(String key);
    
    /**
     * This method returns the logger of a network
     * 
     * @return logger of process
     */
    Logger getLogger();

}
