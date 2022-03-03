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
/** class for form marksEntry  */
public class MarksEntryForm extends Form {
	protected static final String NAME = "marksEntry";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  Field[] FIELDS = {
			new Field("assessmentSchemeId", 0, DefinedDataTypes.id, null, null, null, true), 
			new Field("seqNo", 1, DefinedDataTypes.integer, null, null, null, true), 
			new Field("assessmentName", 2, DefinedDataTypes.text, null, null, null, false), 
			new Field("maxMarks", 3, DefinedDataTypes.integer, null, null, null, false)};
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "marksForAssessment", 1, 0, null,null ,null, true)};
/** constructor */
public MarksEntryForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.localFields = FIELDS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public MarksEntryFd newFormData() {
		return new MarksEntryFd(this, null, null, null);
	}

	@Override
	public MarksEntryFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (MarksEntryFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public MarksEntryFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (MarksEntryFd)super.parseKeys(json, ctx);
	}

	@Override
	public MarksEntryFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (MarksEntryFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public MarksEntryFdt newFormDataTable() {
		return new MarksEntryFdt(this, null, null, null);
	}

	@Override
	public MarksEntryFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new MarksEntryFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public MarksEntryFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new MarksEntryFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
