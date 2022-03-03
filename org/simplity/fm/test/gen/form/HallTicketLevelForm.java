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
import org.simplity.fm.test.gen.schema.ProgramLevelListData;
import org.simplity.fm.test.gen.schema.ProgramLevelListDataTable;
/** class for form hallTicketLevel  */
public class HallTicketLevelForm extends Form {
	protected static final String NAME = "hallTicketLevel";
	protected static final String SCHEMA = "programLevelList";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("hallTicketStudents", "hallTicketStudent", 0, 0, null, new String[]{"programId"}, new String[]{"programId"}, true)};
/** constructor */
public HallTicketLevelForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public HallTicketLevelFd newFormData() {
		return new HallTicketLevelFd(this, null, null, null);
	}

	@Override
	public HallTicketLevelFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (HallTicketLevelFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public HallTicketLevelFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (HallTicketLevelFd)super.parseKeys(json, ctx);
	}

	@Override
	public HallTicketLevelFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (HallTicketLevelFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public HallTicketLevelFdt newFormDataTable() {
		return new HallTicketLevelFdt(this, null, null, null);
	}

	@Override
	public HallTicketLevelFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new HallTicketLevelFd(this, (ProgramLevelListData) schemaData, values, data);
	}

	@Override
	public HallTicketLevelFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new HallTicketLevelFdt(this, (ProgramLevelListDataTable) table, values, linkedData);
	}
}
