/*******************************************************************************  
 * Copyright (c) 2017 Viktor Schmidt.  
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
 *     Viktor Schmidt <vschmidt[at]ckc[dot]de> - initial API and implementation  
 ******************************************************************************/
package sernet.verinice.rcp.templates;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import sernet.gs.ui.rcp.main.bsi.dialogs.CnATreeElementSelectionDialog;
import sernet.verinice.model.common.CnATreeElement;
import sernet.verinice.model.common.CnATreeElement.TemplateType;

/**
 * In this dialog it is possible to add additional modeling templates to the
 * given input ({@link CnATreeElement}).
 * 
 * @see TemplateView
 * @see CnATreeElement#implementedTemplateUuids
 * @see TemplateType
 * @see sernet.gs.server.DeleteOrphanTemplateRelationsJob
 * 
 * @author Viktor Schmidt <vschmidt[at]ckc[dot]de>
 */
public class TemplateSelectionDialog extends CnATreeElementSelectionDialog {

    /**
     * @param shell
     * @param selectedType
     * @param inputElmt
     */
    public TemplateSelectionDialog(Shell shell, CnATreeElement inputElement) {
        super(shell, inputElement.getTypeId(), inputElement);
    }

    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        final int shellWidth = 600;
        final int shellHeight = 500;
        newShell.setSize(shellWidth, shellHeight);
    }

    /**
     * @param container
     * @param scopeId
     */
    @Override
    protected void createSelectionComponent(Composite container) {
        setSelectionComponent(new TemplateSelectionComponent(container, getInputElmt()));
        getSelectionComponent().setScopeOnly(isScopeOnly());
        getSelectionComponent().setShowScopeCheckbox(isShowScopeCheckbox());
        getSelectionComponent().init();
        getSelectionComponent().loadElements();
    }

}
