/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.plugins.simpleweb;

import static io.undertow.Handlers.resource;
import io.undertow.server.HttpHandler;
import io.undertow.server.handlers.resource.ClassPathResourceManager;

import org.syncany.plugins.web.WebInterfacePlugin;

/**
 * @author pheckel
 *
 */
public class SimplewebPlugin extends WebInterfacePlugin {
	public SimplewebPlugin() {
		super("simpleweb");
	}

	@Override
	public HttpHandler createRequestHandler() {
		return resource(new ClassPathResourceManager(SimplewebPlugin.class.getClassLoader(), SimplewebPlugin.class.getPackage()))
			.addWelcomeFiles("index.html")
			.setDirectoryListingEnabled(true);
	}
	
	@Override
	public void start() {
		// Nothing	
	}
}
