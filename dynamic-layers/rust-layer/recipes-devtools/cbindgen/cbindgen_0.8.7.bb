# Auto-Generated by cargo-bitbake 0.3.10
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get cbindgen could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/cbindgen/0.8.7"
SRC_URI += "git://github.com/eqrion/cbindgen.git;protocol=https"
SRCREV = "7b9ea991bdabb442093014d21fde6a192f574f21"
S = "${WORKDIR}/git"
CARGO_SRC_DIR=""

BBCLASSEXTEND = "native"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
crate://crates.io/ansi_term/0.11.0 \
crate://crates.io/atty/0.2.11 \
crate://crates.io/autocfg/0.1.2 \
crate://crates.io/bitflags/1.0.4 \
crate://crates.io/cfg-if/0.1.6 \
crate://crates.io/clap/2.32.0 \
crate://crates.io/cloudabi/0.0.3 \
crate://crates.io/fuchsia-zircon-sys/0.3.3 \
crate://crates.io/fuchsia-zircon/0.3.3 \
crate://crates.io/itoa/0.4.3 \
crate://crates.io/libc/0.2.47 \
crate://crates.io/log/0.4.6 \
crate://crates.io/proc-macro2/0.4.25 \
crate://crates.io/quote/0.6.10 \
crate://crates.io/rand/0.6.4 \
crate://crates.io/rand_chacha/0.1.1 \
crate://crates.io/rand_core/0.3.0 \
crate://crates.io/rand_hc/0.1.0 \
crate://crates.io/rand_isaac/0.1.1 \
crate://crates.io/rand_os/0.1.1 \
crate://crates.io/rand_pcg/0.1.1 \
crate://crates.io/rand_xorshift/0.1.1 \
crate://crates.io/rdrand/0.4.0 \
crate://crates.io/redox_syscall/0.1.50 \
crate://crates.io/redox_termios/0.1.1 \
crate://crates.io/remove_dir_all/0.5.1 \
crate://crates.io/rustc_version/0.2.3 \
crate://crates.io/ryu/0.2.7 \
crate://crates.io/semver-parser/0.7.0 \
crate://crates.io/semver/0.9.0 \
crate://crates.io/serde/1.0.84 \
crate://crates.io/serde_derive/1.0.84 \
crate://crates.io/serde_json/1.0.36 \
crate://crates.io/strsim/0.7.0 \
crate://crates.io/syn/0.15.26 \
crate://crates.io/tempfile/3.0.5 \
crate://crates.io/termion/1.5.1 \
crate://crates.io/textwrap/0.10.0 \
crate://crates.io/toml/0.5.1 \
crate://crates.io/unicode-width/0.1.5 \
crate://crates.io/unicode-xid/0.1.0 \
crate://crates.io/vec_map/0.8.1 \
crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
crate://crates.io/winapi/0.3.6 \
"



LIC_FILES_CHKSUM=" \
file://LICENSE;md5=9741c346eef56131163e13b9db1241b3 \
"

SUMMARY = "A tool for generating C bindings to Rust code."
HOMEPAGE = "https://github.com/eqrion/cbindgen/"
LICENSE = "MPL-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include cbindgen-${PV}.inc
include cbindgen.inc