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
package org.ws4d.df.api.data;

import java.util.List;

import org.ws4d.df.api.comp.Component;
import org.ws4d.df.api.comp.ComponentContext;
import org.ws4d.df.api.comp.InPort;
import org.ws4d.df.api.comp.OutPort;
import org.ws4d.df.api.comp.type.ComponentType;
import org.ws4d.df.api.comp.type.InPortType;
import org.ws4d.df.api.comp.type.OutPortType;
import org.ws4d.df.api.network.NetworkBuilder;

public interface DataProvider {

    public void setNetworlBuilder(NetworkBuilder networkBuilder);

    public void initComponent(ComponentType type, Component component,
            ComponentContext context) throws Exception;

    public void initInPort(ComponentType type, Component component,
            InPortType portType, InPort port) throws Exception;

    public void initInPortArray(ComponentType type, Component component,
            InPortType portType, List<InPort> ports) throws Exception;

    public void initOutPort(ComponentType type, Component component,
            OutPortType portType, OutPort port) throws Exception;

    public void initOutPortArray(ComponentType type, Component component,
            OutPortType portType, List<OutPort> ports) throws Exception;
}
