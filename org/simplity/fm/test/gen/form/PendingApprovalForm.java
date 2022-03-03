package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.PendingApprovalData;
import org.simplity.fm.test.gen.schema.PendingApprovalDataTable;
/** class for form pendingApproval  */
public class PendingApprovalForm extends Form {
	protected static final String NAME = "pendingApproval";
	protected static final String SCHEMA = "pendingApproval";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public PendingApprovalForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public PendingApprovalFd newFormData() {
		return new PendingApprovalFd(this, null, null, null);
	}

	@Override
	public PendingApprovalFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (PendingApprovalFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public PendingApprovalFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (PendingApprovalFd)super.parseKeys(json, ctx);
	}

	@Override
	public PendingApprovalFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (PendingApprovalFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public PendingApprovalFdt newFormDataTable() {
		return new PendingApprovalFdt(this, null, null, null);
	}

	@Override
	public PendingApprovalFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new PendingApprovalFd(this, (PendingApprovalData) schemaData, values, data);
	}

	@Override
	public PendingApprovalFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new PendingApprovalFdt(this, (PendingApprovalDataTable) table, values, linkedData);
	}
}
