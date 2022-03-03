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
/** class for form mainSectionSelection  */
public class MainSectionSelectionForm extends Form {
	protected static final String NAME = "mainSectionSelection";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", true), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true), 
			new Field("subjectSectionId", 2, DefinedDataTypes.id, null, null, null, true)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public MainSectionSelectionForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public MainSectionSelectionFd newFormData() {
		return new MainSectionSelectionFd(this, null, null, null);
	}

	@Override
	public MainSectionSelectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (MainSectionSelectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public MainSectionSelectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (MainSectionSelectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public MainSectionSelectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (MainSectionSelectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public MainSectionSelectionFdt newFormDataTable() {
		return new MainSectionSelectionFdt(this, null, null, null);
	}

	@Override
	public MainSectionSelectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new MainSectionSelectionFd(this, null, values, data);
	}

	@Override
	public MainSectionSelectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new MainSectionSelectionFdt(this, null, values, linkedData);
	}
}
