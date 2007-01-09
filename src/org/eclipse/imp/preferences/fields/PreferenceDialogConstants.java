package org.eclipse.uide.preferences.fields;

import org.eclipse.uide.preferences.ISafariPreferencesService;

public class PreferenceDialogConstants {

	// See also org.eclipse.jface.dialogs.IDialogConstants
	
	// Additional button labels
	public static final String BROWSE_LABEL = "Browse";
	public static final String COPY_LABEL = "Copy In";
	public static final String EMPTY_LABEL = "Set Empty";
	public static final String REMOVE_LABEL = "Remove";
	public static final String SPECIAL_LABEL = "Set Special";
	
	// Statements indicating levels at which effective preferences may be reported
	public static final String CONFIGURATION_LEVEL_STRING = "Details in effect at preferences level 'workspace configuration' ";
	public static final String DEFAULT_LEVEL_STRING = "Details in effect at preferences level 'default' ";
	public static final String INSTANCE_LEVEL_STRING = "Details in effect at preferences level 'workspace instance' ";
	public static final String PROJECT_LEVEL_STRING = "Details in effect at preferences level 'project' ";
	public static final String UNKNOWN_LEVEL_STRING = "Details in effect at preferences level ";
	
	// Statements of preference attributes
	public static final String EMPTY_OK = "\tEmpty value is allowed";
	public static final String EMPTY_NOT_OK = "\tEmpty value is not allowed";
	public static final String IS_REMOVABLE = "\tPreference is removable";
	public static final String NOT_REMOVABLE = "\tPreference is not removable";
	public static final String HAS_SPECIAL = "\tHas special value:  ";
	public static final String NO_SPECIAL = "\tHas no special value";
	
	
	// Compute	user-freindly string designations of preferences levels
	// (may not correspond to internally used values)
	public static String getLevelName(String level) {
        if (level == null) {
        	return "unspecified";
        } else if (level.equals(ISafariPreferencesService.INSTANCE_LEVEL))
        	return "workspace instance";
        else if (level.equals(ISafariPreferencesService.CONFIGURATION_LEVEL))
        	return "workspace configuration";
        else
        	return level;
	}
	
	
	private PreferenceDialogConstants() {};
}
