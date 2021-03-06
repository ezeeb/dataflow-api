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
package org.ws4d.df.api.comp.type;

import java.util.Map;

public interface ComponentType {

    public Class<?> getComponentClass();

    public String getName();

    public boolean isActive();

    public Map<String, InPortType> getSingleInPorts();

    public Map<String, InPortType> getArrayInPorts();

    public Map<String, OutPortType> getSingleOutPorts();

    public Map<String, OutPortType> getArrayOutPorts();
}
