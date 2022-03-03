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
/** class for form offeredSectionSelection  */
public class OfferedSectionSelectionForm extends Form {
	protected static final String NAME = "offeredSectionSelection";
	protected static final  Field[] FIELDS = {
			new Field("departmentId", 0, DefinedDataTypes.id, null, null, "departmentList", true), 
			new Field("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, true), 
			new Field("subjectSectionId", 2, DefinedDataTypes.id, null, null, null, true)};
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public OfferedSectionSelectionForm() {
		this.name = NAME;
		this.operations = OPS;
		this.localFields = FIELDS;
	}

	@Override
	public OfferedSectionSelectionFd newFormData() {
		return new OfferedSectionSelectionFd(this, null, null, null);
	}

	@Override
	public OfferedSectionSelectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (OfferedSectionSelectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public OfferedSectionSelectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (OfferedSectionSelectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public OfferedSectionSelectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (OfferedSectionSelectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public OfferedSectionSelectionFdt newFormDataTable() {
		return new OfferedSectionSelectionFdt(this, null, null, null);
	}

	@Override
	public OfferedSectionSelectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new OfferedSectionSelectionFd(this, null, values, data);
	}

	@Override
	public OfferedSectionSelectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new OfferedSectionSelectionFdt(this, null, values, linkedData);
	}
}
