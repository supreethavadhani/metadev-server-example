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
import org.simplity.fm.test.gen.schema.AssessmentItemNameData;
import org.simplity.fm.test.gen.schema.AssessmentItemNameDataTable;
/** class for form assessmentItemName  */
public class AssessmentItemNameForm extends Form {
	protected static final String NAME = "assessmentItemName";
	protected static final String SCHEMA = "assessmentItemName";
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public AssessmentItemNameForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public AssessmentItemNameFd newFormData() {
		return new AssessmentItemNameFd(this, null, null, null);
	}

	@Override
	public AssessmentItemNameFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AssessmentItemNameFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AssessmentItemNameFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AssessmentItemNameFd)super.parseKeys(json, ctx);
	}

	@Override
	public AssessmentItemNameFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AssessmentItemNameFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AssessmentItemNameFdt newFormDataTable() {
		return new AssessmentItemNameFdt(this, null, null, null);
	}

	@Override
	public AssessmentItemNameFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AssessmentItemNameFd(this, (AssessmentItemNameData) schemaData, values, data);
	}

	@Override
	public AssessmentItemNameFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AssessmentItemNameFdt(this, (AssessmentItemNameDataTable) table, values, linkedData);
	}
}
