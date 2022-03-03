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
import org.simplity.fm.test.gen.schema.CodedPaperNameData;
import org.simplity.fm.test.gen.schema.CodedPaperNameDataTable;
/** class for form codedPaperName  */
public class CodedPaperNameForm extends Form {
	protected static final String NAME = "codedPaperName";
	protected static final String SCHEMA = "codedPaperName";
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public CodedPaperNameForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public CodedPaperNameFd newFormData() {
		return new CodedPaperNameFd(this, null, null, null);
	}

	@Override
	public CodedPaperNameFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (CodedPaperNameFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public CodedPaperNameFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (CodedPaperNameFd)super.parseKeys(json, ctx);
	}

	@Override
	public CodedPaperNameFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (CodedPaperNameFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public CodedPaperNameFdt newFormDataTable() {
		return new CodedPaperNameFdt(this, null, null, null);
	}

	@Override
	public CodedPaperNameFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new CodedPaperNameFd(this, (CodedPaperNameData) schemaData, values, data);
	}

	@Override
	public CodedPaperNameFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new CodedPaperNameFdt(this, (CodedPaperNameDataTable) table, values, linkedData);
	}
}
