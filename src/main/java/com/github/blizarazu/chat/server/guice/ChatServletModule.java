/*
 *  Copyright (C) 2014 blizarazu
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.github.blizarazu.chat.server.guice;

import java.util.Collections;
import java.util.Map;

import org.atmosphere.guice.AtmosphereGuiceServlet;

import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.google.inject.servlet.ServletModule;

public class ChatServletModule extends ServletModule {
	@Override
	public void configureServlets() {
		bind(new TypeLiteral<Map<String, String>>() {
		}).annotatedWith(Names.named(AtmosphereGuiceServlet.PROPERTIES))
				.toInstance(Collections.<String, String> emptyMap());
	}
}
