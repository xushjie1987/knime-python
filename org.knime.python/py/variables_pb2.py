# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: variables.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)




DESCRIPTOR = _descriptor.FileDescriptor(
  name='variables.proto',
  package='knime',
  serialized_pb='\n\x0fvariables.proto\x12\x05knime\"\x9a\x01\n\tVariables\x12/\n\x0fintegerVariable\x18\x02 \x03(\x0b\x32\x16.knime.IntegerVariable\x12-\n\x0e\x64oubleVariable\x18\x03 \x03(\x0b\x32\x15.knime.DoubleVariable\x12-\n\x0estringVariable\x18\x04 \x03(\x0b\x32\x15.knime.StringVariable\"-\n\x0fIntegerVariable\x12\x0b\n\x03key\x18\x01 \x02(\t\x12\r\n\x05value\x18\x02 \x02(\x05\",\n\x0e\x44oubleVariable\x12\x0b\n\x03key\x18\x01 \x02(\t\x12\r\n\x05value\x18\x02 \x02(\x01\",\n\x0eStringVariable\x12\x0b\n\x03key\x18\x01 \x02(\t\x12\r\n\x05value\x18\x02 \x02(\tB>\n\x1dorg.knime.python.kernel.protoB\x1dProtobufPythonKernelVariables')




_VARIABLES = _descriptor.Descriptor(
  name='Variables',
  full_name='knime.Variables',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='integerVariable', full_name='knime.Variables.integerVariable', index=0,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='doubleVariable', full_name='knime.Variables.doubleVariable', index=1,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='stringVariable', full_name='knime.Variables.stringVariable', index=2,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=27,
  serialized_end=181,
)


_INTEGERVARIABLE = _descriptor.Descriptor(
  name='IntegerVariable',
  full_name='knime.IntegerVariable',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='knime.IntegerVariable.key', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=unicode("", "utf-8"),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='value', full_name='knime.IntegerVariable.value', index=1,
      number=2, type=5, cpp_type=1, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=183,
  serialized_end=228,
)


_DOUBLEVARIABLE = _descriptor.Descriptor(
  name='DoubleVariable',
  full_name='knime.DoubleVariable',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='knime.DoubleVariable.key', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=unicode("", "utf-8"),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='value', full_name='knime.DoubleVariable.value', index=1,
      number=2, type=1, cpp_type=5, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=230,
  serialized_end=274,
)


_STRINGVARIABLE = _descriptor.Descriptor(
  name='StringVariable',
  full_name='knime.StringVariable',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='knime.StringVariable.key', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=unicode("", "utf-8"),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='value', full_name='knime.StringVariable.value', index=1,
      number=2, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=unicode("", "utf-8"),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  serialized_start=276,
  serialized_end=320,
)

_VARIABLES.fields_by_name['integerVariable'].message_type = _INTEGERVARIABLE
_VARIABLES.fields_by_name['doubleVariable'].message_type = _DOUBLEVARIABLE
_VARIABLES.fields_by_name['stringVariable'].message_type = _STRINGVARIABLE
DESCRIPTOR.message_types_by_name['Variables'] = _VARIABLES
DESCRIPTOR.message_types_by_name['IntegerVariable'] = _INTEGERVARIABLE
DESCRIPTOR.message_types_by_name['DoubleVariable'] = _DOUBLEVARIABLE
DESCRIPTOR.message_types_by_name['StringVariable'] = _STRINGVARIABLE

class Variables(_message.Message):
  __metaclass__ = _reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _VARIABLES

  # @@protoc_insertion_point(class_scope:knime.Variables)

class IntegerVariable(_message.Message):
  __metaclass__ = _reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _INTEGERVARIABLE

  # @@protoc_insertion_point(class_scope:knime.IntegerVariable)

class DoubleVariable(_message.Message):
  __metaclass__ = _reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _DOUBLEVARIABLE

  # @@protoc_insertion_point(class_scope:knime.DoubleVariable)

class StringVariable(_message.Message):
  __metaclass__ = _reflection.GeneratedProtocolMessageType
  DESCRIPTOR = _STRINGVARIABLE

  # @@protoc_insertion_point(class_scope:knime.StringVariable)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), '\n\035org.knime.python.kernel.protoB\035ProtobufPythonKernelVariables')
# @@protoc_insertion_point(module_scope)