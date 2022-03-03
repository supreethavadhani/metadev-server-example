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
import org.simplity.fm.test.gen.schema.SubjectSectionData;
import org.simplity.fm.test.gen.schema.SubjectSectionDataTable;
/** class for form subjectSection  */
public class SubjectSectionForm extends Form {
	protected static final String NAME = "subjectSection";
	protected static final String SCHEMA = "subjectSection";
	protected static final  boolean[] OPS = {true, true, true, false, true, true};
/** constructor */
public SubjectSectionForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public SubjectSectionFd newFormData() {
		return new SubjectSectionFd(this, null, null, null);
	}

	@Override
	public SubjectSectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SubjectSectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SubjectSectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SubjectSectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public SubjectSectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SubjectSectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SubjectSectionFdt newFormDataTable() {
		return new SubjectSectionFdt(this, null, null, null);
	}

	@Override
	public SubjectSectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SubjectSectionFd(this, (SubjectSectionData) schemaData, values, data);
	}

	@Override
	public SubjectSectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SubjectSectionFdt(this, (SubjectSectionDataTable) table, values, linkedData);
	}
}
