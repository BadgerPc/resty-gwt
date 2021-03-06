/**
 * Copyright (C) 2009-2012 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fusesource.restygwt.examples.client;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.fusesource.restygwt.client.OverlayCallback;
import org.fusesource.restygwt.client.RestService;

/**
 * Simple service to demo the use of overlay objects.
 * @author iteratee@google.com (Kyle Butt)
 */
@Path("/greeting-service")
public interface GreetingService extends RestService {

    @GET
    public void getGreeting(OverlayCallback<Greeting> callback);

    @POST
    public void getCustomGreeting(NameObject nameArg, OverlayCallback<Greeting> callback);
}
