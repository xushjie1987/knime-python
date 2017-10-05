/*
 * ------------------------------------------------------------------------
 *  Copyright by KNIME GmbH, Konstanz, Germany
 *  Website: http://www.knime.com; Email: contact@knime.com
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License, Version 3, as
 *  published by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 *  Additional permission under GNU GPL version 3 section 7:
 *
 *  KNIME interoperates with ECLIPSE solely via ECLIPSE's plug-in APIs.
 *  Hence, KNIME and ECLIPSE are both independent programs and are not
 *  derived from each other. Should, however, the interpretation of the
 *  GNU GPL Version 3 ("License") under any applicable laws result in
 *  KNIME and ECLIPSE being a combined program, KNIME GMBH herewith grants
 *  you the additional permission to use and propagate KNIME together with
 *  ECLIPSE with only the license terms in place for ECLIPSE applying to
 *  ECLIPSE and the GNU GPL Version 3 applying for KNIME, provided the
 *  license terms of ECLIPSE themselves allow for the respective use and
 *  propagation of ECLIPSE together with KNIME.
 *
 *  Additional permission relating to nodes for KNIME that extend the Node
 *  Extension (and in particular that are based on subclasses of NodeModel,
 *  NodeDialog, and NodeView) and that only interoperate with KNIME through
 *  standard APIs ("Nodes"):
 *  Nodes are deemed to be separate and independent programs and to not be
 *  covered works.  Notwithstanding anything to the contrary in the
 *  License, the License does not apply to Nodes, you are not required to
 *  license Nodes under the License, and you are granted a license to
 *  prepare and propagate Nodes, in each case even if such Nodes are
 *  propagated with or for interoperation with KNIME.  The owner of a Node
 *  may freely choose the license terms applicable to such Node, including
 *  when such Node is propagated with or for interoperation with KNIME.
 * ------------------------------------------------------------------------
 */

// automatically generated by the FlatBuffers compiler, do not modify

package org.knime.python2.serde.flatbuffers.flatc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

@SuppressWarnings("javadoc")
public final class ByteCell extends Table {
    public static ByteCell getRootAsByteCell(final ByteBuffer _bb) {
        return getRootAsByteCell(_bb, new ByteCell());
    }

    public static ByteCell getRootAsByteCell(final ByteBuffer _bb, final ByteCell obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public void __init(final int _i, final ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
    }

    public ByteCell __assign(final int _i, final ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public int value(final int j) {
        final int o = __offset(4);
        return o != 0 ? bb.get(__vector(o) + (j * 1)) & 0xFF : 0;
    }

    public int valueLength() {
        final int o = __offset(4);
        return o != 0 ? __vector_len(o) : 0;
    }

    public ByteBuffer valueAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public static int createByteCell(final FlatBufferBuilder builder, final int valueOffset) {
        builder.startObject(1);
        ByteCell.addValue(builder, valueOffset);
        return ByteCell.endByteCell(builder);
    }

    public static void startByteCell(final FlatBufferBuilder builder) {
        builder.startObject(1);
    }

    public static void addValue(final FlatBufferBuilder builder, final int valueOffset) {
        builder.addOffset(0, valueOffset, 0);
    }

    public static int createValueVector(final FlatBufferBuilder builder, final byte[] data) {
        builder.startVector(1, data.length, 1);
        for (int i = data.length - 1; i >= 0; i--) {
            builder.addByte(data[i]);
        }
        return builder.endVector();
    }

    public static void startValueVector(final FlatBufferBuilder builder, final int numElems) {
        builder.startVector(1, numElems, 1);
    }

    public static int endByteCell(final FlatBufferBuilder builder) {
        final int o = builder.endObject();
        return o;
    }
}
