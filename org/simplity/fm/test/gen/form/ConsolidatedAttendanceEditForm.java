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
import org.simplity.fm.test.gen.schema.SubjectSectionDetailData;
import org.simplity.fm.test.gen.schema.SubjectSectionDetailDataTable;
/** class for form consolidatedAttendanceEdit  */
public class ConsolidatedAttendanceEditForm extends Form {
	protected static final String NAME = "consolidatedAttendanceEdit";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  Field[] FIELDS = {
			new Field("currentAttended", 0, DefinedDataTypes.integer, null, null, null, true), 
			new Field("updatedAttended", 1, DefinedDataTypes.integer, null, null, null, true), 
			new Field("studentName", 2, DefinedDataTypes.text, null, null, null, true), 
			new Field("studentId", 3, DefinedDataTypes.id, null, null, null, false)};
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
/** constructor */
public ConsolidatedAttendanceEditForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public ConsolidatedAttendanceEditFd newFormData() {
		return new ConsolidatedAttendanceEditFd(this, null, null, null);
	}

	@Override
	public ConsolidatedAttendanceEditFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ConsolidatedAttendanceEditFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ConsolidatedAttendanceEditFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ConsolidatedAttendanceEditFd)super.parseKeys(json, ctx);
	}

	@Override
	public ConsolidatedAttendanceEditFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ConsolidatedAttendanceEditFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ConsolidatedAttendanceEditFdt newFormDataTable() {
		return new ConsolidatedAttendanceEditFdt(this, null, null, null);
	}

	@Override
	public ConsolidatedAttendanceEditFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ConsolidatedAttendanceEditFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public ConsolidatedAttendanceEditFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ConsolidatedAttendanceEditFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
