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
/** class for form marksForSection  */
public class MarksForSectionForm extends Form {
	protected static final String NAME = "marksForSection";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  Field[] FIELDS = {
			new Field("assessmentSchemeId", 0, DefinedDataTypes.id, null, null, null, true), 
			new Field("seqNo", 1, DefinedDataTypes.integer, null, null, null, true), 
			new Field("isIntegrated", 2, DefinedDataTypes.bool, "true", null, null, false), 
			new Field("freezeAt", 3, DefinedDataTypes.integer, "0", null, null, false)};
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("names", "assessmentItemName", 0, 0, null,null ,null, true),
			new LinkedForm("students", "marksForStudent", 0, 0, null,null ,null, true)};
/** constructor */
public MarksForSectionForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.localFields = FIELDS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public MarksForSectionFd newFormData() {
		return new MarksForSectionFd(this, null, null, null);
	}

	@Override
	public MarksForSectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (MarksForSectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public MarksForSectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (MarksForSectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public MarksForSectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (MarksForSectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public MarksForSectionFdt newFormDataTable() {
		return new MarksForSectionFdt(this, null, null, null);
	}

	@Override
	public MarksForSectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new MarksForSectionFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public MarksForSectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new MarksForSectionFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
