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
import org.simplity.fm.test.gen.schema.PacketRecieveData;
import org.simplity.fm.test.gen.schema.PacketRecieveDataTable;
/** class for form packetRecieve  */
public class PacketRecieveForm extends Form {
	protected static final String NAME = "packetRecieve";
	protected static final String SCHEMA = "packetRecieve";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public PacketRecieveForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public PacketRecieveFd newFormData() {
		return new PacketRecieveFd(this, null, null, null);
	}

	@Override
	public PacketRecieveFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (PacketRecieveFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public PacketRecieveFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (PacketRecieveFd)super.parseKeys(json, ctx);
	}

	@Override
	public PacketRecieveFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (PacketRecieveFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public PacketRecieveFdt newFormDataTable() {
		return new PacketRecieveFdt(this, null, null, null);
	}

	@Override
	public PacketRecieveFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new PacketRecieveFd(this, (PacketRecieveData) schemaData, values, data);
	}

	@Override
	public PacketRecieveFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new PacketRecieveFdt(this, (PacketRecieveDataTable) table, values, linkedData);
	}
}
