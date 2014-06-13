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
 * This interface represents an in port instance
 * 
 * @author Elmar Zeeb
 *
 */
public interface InPort extends Port {

    /**
     * Packets that have not been received by the owner of this port, are
     * discarded. After closing an in-port, calls to receive() will return null.
     */
    void close();

    /**
     * Returns null if one of the follow conditions hold: - the connected
     * out-port has been closed and the underlying data queue is empty - the
     * port has been closed - the port has no connection at all Otherwise it
     * blocks until data arrives.
     *
     * @return next packet in queue or null
     */
    Object receive();
    
    /**
     * Method checks if a call to receive() would block
     * 
     * @return true if packet queue is empty, false otherwise.
     */
    boolean receiveWouldBlock();
}
