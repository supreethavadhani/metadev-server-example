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
import org.simplity.fm.test.gen.schema.HallTicketStudentData;
import org.simplity.fm.test.gen.schema.HallTicketStudentDataTable;
/** class for form hallTicketStudent  */
public class HallTicketStudentForm extends Form {
	protected static final String NAME = "hallTicketStudent";
	protected static final String SCHEMA = "hallTicketStudent";
	protected static final  boolean[] OPS = {true, false, false, false, true, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("subjectDetails", "hallTicketSubject", 0, 0, null, new String[]{"studentId"}, new String[]{"studentId"}, true)};
/** constructor */
public HallTicketStudentForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public HallTicketStudentFd newFormData() {
		return new HallTicketStudentFd(this, null, null, null);
	}

	@Override
	public HallTicketStudentFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (HallTicketStudentFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public HallTicketStudentFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (HallTicketStudentFd)super.parseKeys(json, ctx);
	}

	@Override
	public HallTicketStudentFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (HallTicketStudentFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public HallTicketStudentFdt newFormDataTable() {
		return new HallTicketStudentFdt(this, null, null, null);
	}

	@Override
	public HallTicketStudentFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new HallTicketStudentFd(this, (HallTicketStudentData) schemaData, values, data);
	}

	@Override
	public HallTicketStudentFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new HallTicketStudentFdt(this, (HallTicketStudentDataTable) table, values, linkedData);
	}
}
