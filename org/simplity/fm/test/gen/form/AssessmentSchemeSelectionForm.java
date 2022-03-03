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
import org.simplity.fm.test.gen.schema.AssessmentSchemeSelectionData;
import org.simplity.fm.test.gen.schema.AssessmentSchemeSelectionDataTable;
/** class for form assessmentSchemeSelection  */
public class AssessmentSchemeSelectionForm extends Form {
	protected static final String NAME = "assessmentSchemeSelection";
	protected static final String SCHEMA = "assessmentSchemeSelection";
	protected static final  boolean[] OPS = {true, false, true, false, false, false};
/** constructor */
public AssessmentSchemeSelectionForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public AssessmentSchemeSelectionFd newFormData() {
		return new AssessmentSchemeSelectionFd(this, null, null, null);
	}

	@Override
	public AssessmentSchemeSelectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AssessmentSchemeSelectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AssessmentSchemeSelectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AssessmentSchemeSelectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public AssessmentSchemeSelectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AssessmentSchemeSelectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AssessmentSchemeSelectionFdt newFormDataTable() {
		return new AssessmentSchemeSelectionFdt(this, null, null, null);
	}

	@Override
	public AssessmentSchemeSelectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AssessmentSchemeSelectionFd(this, (AssessmentSchemeSelectionData) schemaData, values, data);
	}

	@Override
	public AssessmentSchemeSelectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AssessmentSchemeSelectionFdt(this, (AssessmentSchemeSelectionDataTable) table, values, linkedData);
	}
}
