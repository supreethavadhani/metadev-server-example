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
/** class for form coding  */
public class CodingForm extends Form {
	protected static final String NAME = "coding";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, null, false), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true), 
			new Field("isMakeup", 2, DefinedDataTypes.bool, null, null, null, false), 
			new Field("valuation_round", 3, DefinedDataTypes.integer, null, null, "valuationRoundList", true)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
	protected static final LinkedForm[] LINKED_FORMS = {
			new LinkedForm("students", "codedPaper", 0, 0, null,null ,null, true)};
/** constructor */
public CodingForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
		this.linkedForms = LINKED_FORMS;
		this.initialize();
	}

	@Override
	public CodingFd newFormData() {
		return new CodingFd(this, null, null, null);
	}

	@Override
	public CodingFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (CodingFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public CodingFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (CodingFd)super.parseKeys(json, ctx);
	}

	@Override
	public CodingFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (CodingFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public CodingFdt newFormDataTable() {
		return new CodingFdt(this, null, null, null);
	}

	@Override
	public CodingFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new CodingFd(this, null, values, data);
	}

	@Override
	public CodingFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new CodingFdt(this, null, values, linkedData);
	}
}
