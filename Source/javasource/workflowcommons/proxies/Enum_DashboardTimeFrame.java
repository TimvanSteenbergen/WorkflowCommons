// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public enum Enum_DashboardTimeFrame
{
	Last_7_days(new java.lang.String[][] { new java.lang.String[] { "en_US", "Last 7 days" } }),
	Last_4_weeks(new java.lang.String[][] { new java.lang.String[] { "en_US", "Last 4 weeks" } }),
	Last_3_months(new java.lang.String[][] { new java.lang.String[] { "en_US", "Last 3 months" } }),
	Last_6_months(new java.lang.String[][] { new java.lang.String[] { "en_US", "Last 6 months" } }),
	This_year(new java.lang.String[][] { new java.lang.String[] { "en_US", "This year" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_DashboardTimeFrame(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
