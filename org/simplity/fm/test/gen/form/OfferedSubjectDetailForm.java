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
import org.simplity.fm.test.gen.schema.OfferedSubjectDetailData;
import org.simplity.fm.test.gen.schema.OfferedSubjectDetailDataTable;
/** class for form offeredSubjectDetail  */
public class OfferedSubjectDetailForm extends Form {
	protected static final String NAME = "offeredSubjectDetail";
	protected static final String SCHEMA = "offeredSubjectDetail";
	protected static final  boolean[] OPS = {true, false, true, true, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("sections", "offerableSection", 0, 0, null, new String[]{"levelId"}, new String[]{"levelId"}, true)};
/** constructor */
public OfferedSubjectDetailForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public OfferedSubjectDetailFd newFormData() {
		return new OfferedSubjectDetailFd(this, null, null, null);
	}

	@Override
	public OfferedSubjectDetailFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (OfferedSubjectDetailFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public OfferedSubjectDetailFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (OfferedSubjectDetailFd)super.parseKeys(json, ctx);
	}

	@Override
	public OfferedSubjectDetailFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (OfferedSubjectDetailFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public OfferedSubjectDetailFdt newFormDataTable() {
		return new OfferedSubjectDetailFdt(this, null, null, null);
	}

	@Override
	public OfferedSubjectDetailFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new OfferedSubjectDetailFd(this, (OfferedSubjectDetailData) schemaData, values, data);
	}

	@Override
	public OfferedSubjectDetailFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new OfferedSubjectDetailFdt(this, (OfferedSubjectDetailDataTable) table, values, linkedData);
	}
}
