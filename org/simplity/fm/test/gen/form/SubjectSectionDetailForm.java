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
/** class for form subjectSectionDetail  */
public class SubjectSectionDetailForm extends Form {
	protected static final String NAME = "subjectSectionDetail";
	protected static final String SCHEMA = "subjectSectionDetail";
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public SubjectSectionDetailForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public SubjectSectionDetailFd newFormData() {
		return new SubjectSectionDetailFd(this, null, null, null);
	}

	@Override
	public SubjectSectionDetailFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (SubjectSectionDetailFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public SubjectSectionDetailFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (SubjectSectionDetailFd)super.parseKeys(json, ctx);
	}

	@Override
	public SubjectSectionDetailFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (SubjectSectionDetailFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public SubjectSectionDetailFdt newFormDataTable() {
		return new SubjectSectionDetailFdt(this, null, null, null);
	}

	@Override
	public SubjectSectionDetailFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new SubjectSectionDetailFd(this, (SubjectSectionDetailData) schemaData, values, data);
	}

	@Override
	public SubjectSectionDetailFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new SubjectSectionDetailFdt(this, (SubjectSectionDetailDataTable) table, values, linkedData);
	}
}
