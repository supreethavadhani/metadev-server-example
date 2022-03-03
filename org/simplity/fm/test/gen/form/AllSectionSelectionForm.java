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
/** class for form allSectionSelection  */
public class AllSectionSelectionForm extends Form {
	protected static final String NAME = "allSectionSelection";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", true), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true), 
			new Field("subjectSectionId", 2, DefinedDataTypes.id, null, null, null, true)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public AllSectionSelectionForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public AllSectionSelectionFd newFormData() {
		return new AllSectionSelectionFd(this, null, null, null);
	}

	@Override
	public AllSectionSelectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (AllSectionSelectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public AllSectionSelectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (AllSectionSelectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public AllSectionSelectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (AllSectionSelectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public AllSectionSelectionFdt newFormDataTable() {
		return new AllSectionSelectionFdt(this, null, null, null);
	}

	@Override
	public AllSectionSelectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new AllSectionSelectionFd(this, null, values, data);
	}

	@Override
	public AllSectionSelectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new AllSectionSelectionFdt(this, null, values, linkedData);
	}
}
