// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class WorkflowAttachment extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.WorkflowAttachment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		WorkflowAttachment_Workflow("WorkflowCommons.WorkflowAttachment_Workflow");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public WorkflowAttachment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WorkflowAttachment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowAttachmentMendixObject)
	{
		super(context, workflowAttachmentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, workflowAttachmentMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'WorkflowAttachment.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowcommons.proxies.WorkflowAttachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowcommons.proxies.WorkflowAttachment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static workflowcommons.proxies.WorkflowAttachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.WorkflowAttachment(context, mendixObject);
	}

	public static workflowcommons.proxies.WorkflowAttachment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.WorkflowAttachment.initialize(context, mendixObject);
	}

	public static java.util.List<workflowcommons.proxies.WorkflowAttachment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> workflowcommons.proxies.WorkflowAttachment.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowAttachment_Workflow
	 */
	public final system.proxies.Workflow getWorkflowAttachment_Workflow() throws com.mendix.core.CoreException
	{
		return getWorkflowAttachment_Workflow(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowAttachment_Workflow
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.Workflow getWorkflowAttachment_Workflow(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Workflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowAttachment_Workflow.toString());
		if (identifier != null) {
			result = system.proxies.Workflow.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowAttachment_Workflow
	 * @param workflowattachment_workflow
	 */
	public final void setWorkflowAttachment_Workflow(system.proxies.Workflow workflowattachment_workflow)
	{
		setWorkflowAttachment_Workflow(getContext(), workflowattachment_workflow);
	}

	/**
	 * Set value of WorkflowAttachment_Workflow
	 * @param context
	 * @param workflowattachment_workflow
	 */
	public final void setWorkflowAttachment_Workflow(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Workflow workflowattachment_workflow)
	{
		if (workflowattachment_workflow == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowAttachment_Workflow.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowAttachment_Workflow.toString(), workflowattachment_workflow.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowcommons.proxies.WorkflowAttachment that = (workflowcommons.proxies.WorkflowAttachment) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
