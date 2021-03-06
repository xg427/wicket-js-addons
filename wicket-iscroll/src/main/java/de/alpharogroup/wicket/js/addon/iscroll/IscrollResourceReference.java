/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.wicket.js.addon.iscroll;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 * The Class {@link IscrollResourceReference} holds the references(js) for the js library iscroll.
 */
public class IscrollResourceReference extends JavaScriptResourceReference
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Constant INSTANCE. */
	private static final IscrollResourceReference INSTANCE = new IscrollResourceReference();

	/**
	 * Gets the singleton instance for this resource reference.
	 *
	 * @return the {@link IscrollResourceReference} instance
	 */
	public static IscrollResourceReference get()
	{
		return INSTANCE;
	}

	/**
	 * Instantiates a new {@link IscrollResourceReference}.
	 */
	private IscrollResourceReference()
	{
		super(IscrollResourceReference.class, "iscroll.js");
	}

}
