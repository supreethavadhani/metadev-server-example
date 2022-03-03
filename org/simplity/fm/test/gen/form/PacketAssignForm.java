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
import org.simplity.fm.test.gen.schema.PacketAssignData;
import org.simplity.fm.test.gen.schema.PacketAssignDataTable;
/** class for form packetAssign  */
public class PacketAssignForm extends Form {
	protected static final String NAME = "packetAssign";
	protected static final String SCHEMA = "packetAssign";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public PacketAssignForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public PacketAssignFd newFormData() {
		return new PacketAssignFd(this, null, null, null);
	}

	@Override
	public PacketAssignFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (PacketAssignFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public PacketAssignFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (PacketAssignFd)super.parseKeys(json, ctx);
	}

	@Override
	public PacketAssignFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (PacketAssignFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public PacketAssignFdt newFormDataTable() {
		return new PacketAssignFdt(this, null, null, null);
	}

	@Override
	public PacketAssignFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new PacketAssignFd(this, (PacketAssignData) schemaData, values, data);
	}

	@Override
	public PacketAssignFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new PacketAssignFdt(this, (PacketAssignDataTable) table, values, linkedData);
	}
}
