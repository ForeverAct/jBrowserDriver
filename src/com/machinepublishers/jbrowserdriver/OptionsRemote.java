/* 
 * jBrowserDriver (TM)
 * Copyright (C) 2014-2016 Machine Publishers, LLC and the jBrowserDriver contributors
 * https://github.com/MachinePublishers/jBrowserDriver
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
package com.machinepublishers.jbrowserdriver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

import org.openqa.selenium.Cookie;

interface OptionsRemote extends Remote {
  void addCookie(Cookie cookie) throws RemoteException;

  void deleteAllCookies() throws RemoteException;

  void deleteCookie(Cookie cookie) throws RemoteException;

  void deleteCookieNamed(String name) throws RemoteException;

  Cookie getCookieNamed(String name) throws RemoteException;

  Set<Cookie> getCookies() throws RemoteException;

  ImeHandlerRemote ime() throws RemoteException;

  LogsRemote logs() throws RemoteException;

  TimeoutsRemote timeouts() throws RemoteException;

  WindowRemote window() throws RemoteException;
}
