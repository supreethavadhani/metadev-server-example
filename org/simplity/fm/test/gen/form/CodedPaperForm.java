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
import org.simplity.fm.test.gen.schema.CodedPaperData;
import org.simplity.fm.test.gen.schema.CodedPaperDataTable;
/** class for form codedPaper  */
public class CodedPaperForm extends Form {
	protected static final String NAME = "codedPaper";
	protected static final String SCHEMA = "codedPaper";
	protected static final  boolean[] OPS = {false, false, false, false, false, false};
/** constructor */
public CodedPaperForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public CodedPaperFd newFormData() {
		return new CodedPaperFd(this, null, null, null);
	}

	@Override
	public CodedPaperFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (CodedPaperFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public CodedPaperFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (CodedPaperFd)super.parseKeys(json, ctx);
	}

	@Override
	public CodedPaperFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (CodedPaperFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public CodedPaperFdt newFormDataTable() {
		return new CodedPaperFdt(this, null, null, null);
	}

	@Override
	public CodedPaperFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new CodedPaperFd(this, (CodedPaperData) schemaData, values, data);
	}

	@Override
	public CodedPaperFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new CodedPaperFdt(this, (CodedPaperDataTable) table, values, linkedData);
	}
}
