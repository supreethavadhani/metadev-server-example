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
/** class for form offeredSubjectSelection  */
public class OfferedSubjectSelectionForm extends Form {
	protected static final String NAME = "offeredSubjectSelection";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", true), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public OfferedSubjectSelectionForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public OfferedSubjectSelectionFd newFormData() {
		return new OfferedSubjectSelectionFd(this, null, null, null);
	}

	@Override
	public OfferedSubjectSelectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (OfferedSubjectSelectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public OfferedSubjectSelectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (OfferedSubjectSelectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public OfferedSubjectSelectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (OfferedSubjectSelectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public OfferedSubjectSelectionFdt newFormDataTable() {
		return new OfferedSubjectSelectionFdt(this, null, null, null);
	}

	@Override
	public OfferedSubjectSelectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new OfferedSubjectSelectionFd(this, null, values, data);
	}

	@Override
	public OfferedSubjectSelectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new OfferedSubjectSelectionFdt(this, null, values, linkedData);
	}
}
