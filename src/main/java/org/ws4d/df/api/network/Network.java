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

import org.ws4d.df.api.comp.ComponentTracer;
import org.ws4d.df.api.comp.PortTracer;

public interface Network {

	/**
	 * This method returns the unique id of this network
	 * 
	 * @return id of the network
	 */
    public String getNetworkId();
	
    /**
     * This method starts a network and blocks until the network is finished and
     * terminated. This methode can be called only once for a network!
     *
     * @throws Exception
     */
    void startAndTerminate() throws Exception;

    /**
     * This method blocks until the network has finished, and can be called
     * several times. Clients of this method must call terminate explicitely.
     *
     * @throws Exception
     */
    void start() throws Exception;

    /**
     * This method blocks until a network has terminated and should be called
     * onyl for networks that were started with the start() method.
     */
    void terminate();

    /**
     * This methods sets the runtime properties related to a network
     *
     * @param key key of property
     * @param object value of property
     */
    void setRuntimeProperty(String key, Object object);

    /**
     * This methods returns a runtime property related to a network
     *
     * @param key name of property
     * @return value of property
     */
    Object getRuntimeProperty(String key);

    /**
     * This method returns the logger of a network
     * 
     * @return logger of process
     */
    Logger getLogger();
    
    /**
     * This method registers a port tracer at the network
     * 
     * @param tracer instance of port tracer interface
     */
    void setPortTracer(PortTracer tracer);

    /**
     * This method registers a component tracer at the network
     * 
     * @param tracer instance of the component tracer interface
     */
    void setComponentTracer(ComponentTracer tracer);

    /**
     * This method registers a network tracer at the network
     * 
     * @param tracer instance of network tracer interface
     */
    void setNetworkTracer(NetworkTracer tracer);

}
