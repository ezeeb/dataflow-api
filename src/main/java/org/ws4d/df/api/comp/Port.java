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
package org.ws4d.df.api.comp;

/**
 * This interface represents a port instance
 * 
 * @author Elmar Zeeb
 *
 */

public interface Port {

    /**
     * Method to get the name of a port.
     *
     * @return name of the port.
     */
    String getName();
    
    /**
     * Method to get the index of an array port.
     *
     * @return index of array port.
     */
    int getIndex();
    
    
    /**
     * Method to get the component that contains this port.
     * 
     * @return component context of containing component.
     */
    ComponentContext getComponent();

    /**
     * This method closes a port.
     */
    void close();

    /**
     * This method returns if a port is close.
     * @return
     */
    boolean isClosed();

}
