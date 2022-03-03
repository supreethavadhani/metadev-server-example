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
/** class for form consolidatedAttendance  */
public class ConsolidatedAttendanceForm extends Form {
	protected static final String NAME = "consolidatedAttendance";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  Field[] FIELDS = {
			new Field("freezeAt", 0, DefinedDataTypes.integer, "0", null, null, false)};
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "sectionAttendance", 1, 0, null, new String[]{"subjectSectionId"}, new String[]{"subjectSectionId"}, true)};
/** constructor */
public ConsolidatedAttendanceForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.localFields = FIELDS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public ConsolidatedAttendanceFd newFormData() {
		return new ConsolidatedAttendanceFd(this, null, null, null);
	}

	@Override
	public ConsolidatedAttendanceFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (ConsolidatedAttendanceFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public ConsolidatedAttendanceFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (ConsolidatedAttendanceFd)super.parseKeys(json, ctx);
	}

	@Override
	public ConsolidatedAttendanceFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (ConsolidatedAttendanceFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public ConsolidatedAttendanceFdt newFormDataTable() {
		return new ConsolidatedAttendanceFdt(this, null, null, null);
	}

	@Override
	public ConsolidatedAttendanceFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new ConsolidatedAttendanceFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public ConsolidatedAttendanceFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new ConsolidatedAttendanceFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
