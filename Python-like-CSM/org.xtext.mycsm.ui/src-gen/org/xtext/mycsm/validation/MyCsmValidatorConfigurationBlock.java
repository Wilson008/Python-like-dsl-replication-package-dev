/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mycsm.validation;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.xbase.ui.validation.XbaseValidationConfigurationBlock;

@SuppressWarnings("restriction")
public class MyCsmValidatorConfigurationBlock extends XbaseValidationConfigurationBlock {

	protected static final String SETTINGS_SECTION_NAME = "MyCsm";

	@Override
	protected void fillSettingsPage(Composite composite, int nColumns, int defaultIndent) {
		addComboBox(MyCsmConfigurableIssueCodesProvider.DEPRECATED_MODEL_PART, "Deprecated Model Part", composite, defaultIndent);
		super.fillSettingsPage(composite, nColumns, defaultIndent);
	}

	@Override
	public void dispose() {
		storeSectionExpansionStates(getDialogSettings());
		super.dispose();
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings dialogSettings = super.getDialogSettings();
		IDialogSettings section = dialogSettings.getSection(SETTINGS_SECTION_NAME);
		if (section == null) {
			return dialogSettings.addNewSection(SETTINGS_SECTION_NAME);
		}
		return section;
	}
}
