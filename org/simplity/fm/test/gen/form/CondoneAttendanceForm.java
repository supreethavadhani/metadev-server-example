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
/** class for form condoneAttendance  */
public class CondoneAttendanceForm extends Form {
	protected static final String NAME = "condoneAttendance";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "eligibilityList", 0, 0, null,null ,null, true)};
/** constructor */
public CondoneAttendanceForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public CondoneAttendanceFd newFormData() {
		return new CondoneAttendanceFd(this, null, null, null);
	}

	@Override
	public CondoneAttendanceFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (CondoneAttendanceFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public CondoneAttendanceFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (CondoneAttendanceFd)super.parseKeys(json, ctx);
	}

	@Override
	public CondoneAttendanceFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (CondoneAttendanceFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public CondoneAttendanceFdt newFormDataTable() {
		return new CondoneAttendanceFdt(this, null, null, null);
	}

	@Override
	public CondoneAttendanceFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new CondoneAttendanceFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public CondoneAttendanceFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new CondoneAttendanceFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
