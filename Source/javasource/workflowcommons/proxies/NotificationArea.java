// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class NotificationArea
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject notificationAreaMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.NotificationArea";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AlertTitle("AlertTitle"),
		AlertMessage("AlertMessage"),
		RenderAs("RenderAs");

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

	public NotificationArea(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected NotificationArea(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject notificationAreaMendixObject)
	{
		if (notificationAreaMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, notificationAreaMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.notificationAreaMendixObject = notificationAreaMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'NotificationArea.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowcommons.proxies.NotificationArea initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowcommons.proxies.NotificationArea.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static workflowcommons.proxies.NotificationArea initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.NotificationArea(context, mendixObject);
	}

	public static workflowcommons.proxies.NotificationArea load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.NotificationArea.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of AlertTitle
	 */
	public final java.lang.String getAlertTitle()
	{
		return getAlertTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of AlertTitle
	 */
	public final java.lang.String getAlertTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AlertTitle.toString());
	}

	/**
	 * Set value of AlertTitle
	 * @param alerttitle
	 */
	public final void setAlertTitle(java.lang.String alerttitle)
	{
		setAlertTitle(getContext(), alerttitle);
	}

	/**
	 * Set value of AlertTitle
	 * @param context
	 * @param alerttitle
	 */
	public final void setAlertTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String alerttitle)
	{
		getMendixObject().setValue(context, MemberNames.AlertTitle.toString(), alerttitle);
	}

	/**
	 * @return value of AlertMessage
	 */
	public final java.lang.String getAlertMessage()
	{
		return getAlertMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of AlertMessage
	 */
	public final java.lang.String getAlertMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AlertMessage.toString());
	}

	/**
	 * Set value of AlertMessage
	 * @param alertmessage
	 */
	public final void setAlertMessage(java.lang.String alertmessage)
	{
		setAlertMessage(getContext(), alertmessage);
	}

	/**
	 * Set value of AlertMessage
	 * @param context
	 * @param alertmessage
	 */
	public final void setAlertMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String alertmessage)
	{
		getMendixObject().setValue(context, MemberNames.AlertMessage.toString(), alertmessage);
	}

	/**
	 * Set value of RenderAs
	 * @param renderas
	 */
	public final workflowcommons.proxies.Enum_NotificationArea_RenderAs getRenderAs()
	{
		return getRenderAs(getContext());
	}

	/**
	 * @param context
	 * @return value of RenderAs
	 */
	public final workflowcommons.proxies.Enum_NotificationArea_RenderAs getRenderAs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RenderAs.toString());
		if (obj == null) {
			return null;
		}
		return workflowcommons.proxies.Enum_NotificationArea_RenderAs.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RenderAs
	 * @param renderas
	 */
	public final void setRenderAs(workflowcommons.proxies.Enum_NotificationArea_RenderAs renderas)
	{
		setRenderAs(getContext(), renderas);
	}

	/**
	 * Set value of RenderAs
	 * @param context
	 * @param renderas
	 */
	public final void setRenderAs(com.mendix.systemwideinterfaces.core.IContext context, workflowcommons.proxies.Enum_NotificationArea_RenderAs renderas)
	{
		if (renderas != null) {
			getMendixObject().setValue(context, MemberNames.RenderAs.toString(), renderas.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.RenderAs.toString(), null);
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return notificationAreaMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowcommons.proxies.NotificationArea that = (workflowcommons.proxies.NotificationArea) obj;
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
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
