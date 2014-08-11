/*
 * 
 * Copyright (c) 2014 blizarazu.
 *
 * This file is part of gwtp-atmosphere-chat.
 *
 * gwtp-atmosphere-chat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * gwtp-atmosphere-chat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with gwtp-atmosphere-chat.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.github.blizarazu.chat.server.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceServletConfig extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServerModule(), new DispatchServletModule(),
                new ChatServletModule());
    }
}
