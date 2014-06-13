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

import org.ws4d.df.api.comp.type.ComponentTypeRegistry;
import org.ws4d.df.api.data.DataProvider;

public interface NetworkBuilder {

    public void setDataProvider(DataProvider dataProvider);

    public DataProvider getDataProvider();

    public void setComponentTypeRegistry(ComponentTypeRegistry registry);

    public ComponentTypeRegistry getComponentTypeRegistry();
    
    public void setConnectionValidator(ConnectionValidator connectionValidator);
    
    public ConnectionValidator getConnectionValidator();

    void addComponent(String componentName, Class<?> componentClass)
            throws Exception;

    void setCapacity(String receiverName, String inPortName, int capacity)
            throws Exception;

    void setCapacity(String receiverName, String inPortName, int index,
            int capacity) throws Exception;

    void initialize(String receiverName, String inPortName, Object packet)
            throws Exception;

    void initialize(String receiverName, String inPortName, int index,
            Object packet) throws Exception;

    void initialize(String receiverName, String inPortName, Object packet,
            boolean isStatic) throws Exception;

    void initialize(String receiverName, String inPortName, int index,
            Object packet, boolean isStatic) throws Exception;

    void connect(String senderName, String outPortName, String receiverName,
            String inPortName) throws Exception;

    void connect(String senderName, String outPortName, int outIndex,
            String receiverName, String inPortName) throws Exception;

    void connect(String senderName, String outPortName, String receiverName,
            String inPortName, int inIndex) throws Exception;

    void connect(String senderName, String outPortName, int outIndex,
            String receiverName, String inPortName, int inIndex)
            throws Exception;

    Network buildNetwork() throws Exception;

}