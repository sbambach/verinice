/*******************************************************************************
 * Copyright (c) 2016 Sebastian Hagedorn.
 *
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Sebastian Hagedorn <sh[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.report.service.impl.security;

import org.eclipse.osgi.util.NLS;

/**
 * @author Sebastian Hagedorn <sh[at]sernet[dot]de>
 */
public class Messages extends NLS {
    
    private static final String BUNDLE_NAME = "sernet.verinice.report.service.impl.security.messages"; //$NON-NLS-1$
    
    public static String UNAUTHORIZED_EXECUTION_CALL_DETECTED;
    public static String REPORT_SECURITY_EXCEPTION_0;
    public static String REPORT_SECURITY_EXCEPTION_1;
    public static String REPORT_RENDER_EXCEPTION_0;
    
    private Messages(){}
    

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

}
