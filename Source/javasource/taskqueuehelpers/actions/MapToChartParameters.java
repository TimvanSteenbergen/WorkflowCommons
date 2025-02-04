// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package taskqueuehelpers.actions;

import java.util.stream.Collectors;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import taskqueuehelpers.proxies.ChartParameters;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Map the ProcessedQueuedTask entities to ChartParametersEntity for chart views.
 */
public class MapToChartParameters extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.util.List<IMendixObject> __processedQueueTasks;
	private java.util.List<system.proxies.ProcessedQueueTask> processedQueueTasks;

	public MapToChartParameters(IContext context, java.util.List<IMendixObject> processedQueueTasks)
	{
		super(context);
		this.__processedQueueTasks = processedQueueTasks;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.processedQueueTasks = java.util.Optional.ofNullable(this.__processedQueueTasks)
			.orElse(java.util.Collections.emptyList())
			.stream()
			.map(__processedQueueTasksElement -> system.proxies.ProcessedQueueTask.initialize(getContext(), __processedQueueTasksElement))
			.collect(java.util.stream.Collectors.toList());

		// BEGIN USER CODE
		return processedQueueTasks.stream().map(this::createChartParameter).collect(Collectors.toList());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "MapToChartParameters";
	}

	// BEGIN EXTRA CODE
	private IMendixObject createChartParameter(system.proxies.ProcessedQueueTask processedQueueTask) {
		final ChartParameters parameter = new ChartParameters(getContext());
		parameter.setQueueName(processedQueueTask.getQueueName());
		parameter.setSequence(processedQueueTask.getSequence());
		parameter.setStatus(processedQueueTask.getStatus().toString());
		return parameter.getMendixObject();
	}
	// END EXTRA CODE
}
