/******************************************************************************* 
 * Copyright (c) 2016 Viktor Schmidt. 
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

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import sernet.gs.ui.rcp.main.ExceptionUtil;
import sernet.gs.ui.rcp.main.bsi.actions.Messages;
import sernet.gs.ui.rcp.main.common.model.CnAElementFactory;
import sernet.gs.ui.rcp.main.common.model.CnAElementHome;
import sernet.verinice.model.bsi.BausteinUmsetzung;
import sernet.verinice.model.common.CnATreeElement;
import sernet.verinice.model.common.CnATreeElement.TemplateType;

/**
 * This action mark the selected module {@link BausteinUmsetzung}s as modeling
 * template ({@link TemplateType#TEMPLATE}).
 * 
 * @author Viktor Schmidt <vschmidt[at]ckc[dot]de>
 * @see MarkTemplateActionDelegate
 */
public class MarkTemplateModuleActionDelegate extends MarkTemplateActionDelegate {
    private IWorkbenchPart targetPart;

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        this.targetPart = targetPart;
    }

    @Override
    public void run(IAction action) {
        try {
            Object selection = ((IStructuredSelection) targetPart.getSite().getSelectionProvider().getSelection()).getFirstElement();
            if (selection instanceof BausteinUmsetzung) {
                BausteinUmsetzung module = (BausteinUmsetzung) selection;
                module.setTemplateTypeValue(CnATreeElement.TemplateType.TEMPLATE.name());
                CnAElementHome.getInstance().update(module);
                // notify all listeners:
                CnAElementFactory.getModel(module.getParent()).childChanged(module);
                CnAElementFactory.getModel(module.getParent()).databaseChildChanged(module);
            }
        } catch (Exception e) {
            ExceptionUtil.log(e, Messages.MarkTemplateModuleActionDelegate_0);
        }
    }
}
