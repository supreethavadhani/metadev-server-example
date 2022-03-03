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
/** class for form taughtSubjectSelection  */
public class TaughtSubjectSelectionForm extends Form {
	protected static final String NAME = "taughtSubjectSelection";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", true), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public TaughtSubjectSelectionForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public TaughtSubjectSelectionFd newFormData() {
		return new TaughtSubjectSelectionFd(this, null, null, null);
	}

	@Override
	public TaughtSubjectSelectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (TaughtSubjectSelectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public TaughtSubjectSelectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (TaughtSubjectSelectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public TaughtSubjectSelectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (TaughtSubjectSelectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public TaughtSubjectSelectionFdt newFormDataTable() {
		return new TaughtSubjectSelectionFdt(this, null, null, null);
	}

	@Override
	public TaughtSubjectSelectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new TaughtSubjectSelectionFd(this, null, values, data);
	}

	@Override
	public TaughtSubjectSelectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new TaughtSubjectSelectionFdt(this, null, values, linkedData);
	}
}
