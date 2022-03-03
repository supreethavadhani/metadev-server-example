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
import org.simplity.fm.test.gen.schema.HallTicketSubjectData;
import org.simplity.fm.test.gen.schema.HallTicketSubjectDataTable;
/** class for form hallTicketSubject  */
public class HallTicketSubjectForm extends Form {
	protected static final String NAME = "hallTicketSubject";
	protected static final String SCHEMA = "hallTicketSubject";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
/** constructor */
public HallTicketSubjectForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public HallTicketSubjectFd newFormData() {
		return new HallTicketSubjectFd(this, null, null, null);
	}

	@Override
	public HallTicketSubjectFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (HallTicketSubjectFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public HallTicketSubjectFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (HallTicketSubjectFd)super.parseKeys(json, ctx);
	}

	@Override
	public HallTicketSubjectFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (HallTicketSubjectFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public HallTicketSubjectFdt newFormDataTable() {
		return new HallTicketSubjectFdt(this, null, null, null);
	}

	@Override
	public HallTicketSubjectFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new HallTicketSubjectFd(this, (HallTicketSubjectData) schemaData, values, data);
	}

	@Override
	public HallTicketSubjectFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new HallTicketSubjectFdt(this, (HallTicketSubjectDataTable) table, values, linkedData);
	}
}
