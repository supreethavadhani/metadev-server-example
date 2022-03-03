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
import org.simplity.fm.test.gen.schema.PacketListData;
import org.simplity.fm.test.gen.schema.PacketListDataTable;
/** class for form packetList  */
public class PacketListForm extends Form {
	protected static final String NAME = "packetList";
	protected static final String SCHEMA = "packetList";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public PacketListForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public PacketListFd newFormData() {
		return new PacketListFd(this, null, null, null);
	}

	@Override
	public PacketListFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (PacketListFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public PacketListFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (PacketListFd)super.parseKeys(json, ctx);
	}

	@Override
	public PacketListFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (PacketListFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public PacketListFdt newFormDataTable() {
		return new PacketListFdt(this, null, null, null);
	}

	@Override
	public PacketListFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new PacketListFd(this, (PacketListData) schemaData, values, data);
	}

	@Override
	public PacketListFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new PacketListFdt(this, (PacketListDataTable) table, values, linkedData);
	}
}
