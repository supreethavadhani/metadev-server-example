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
/** class for form marksForIntegratedSection  */
public class MarksForIntegratedSectionForm extends Form {
	protected static final String NAME = "marksForIntegratedSection";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  Field[] FIELDS = {
			new Field("isIntegrated", 0, DefinedDataTypes.bool, "true", null, null, false)};
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "integratedCie", 0, 0, null,null ,null, true)};
/** constructor */
public MarksForIntegratedSectionForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.localFields = FIELDS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public MarksForIntegratedSectionFd newFormData() {
		return new MarksForIntegratedSectionFd(this, null, null, null);
	}

	@Override
	public MarksForIntegratedSectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (MarksForIntegratedSectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public MarksForIntegratedSectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (MarksForIntegratedSectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public MarksForIntegratedSectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (MarksForIntegratedSectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public MarksForIntegratedSectionFdt newFormDataTable() {
		return new MarksForIntegratedSectionFdt(this, null, null, null);
	}

	@Override
	public MarksForIntegratedSectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new MarksForIntegratedSectionFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public MarksForIntegratedSectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new MarksForIntegratedSectionFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
