/*
 * DOJAH APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// VerifyPhotoIdWithSelfieResponseEntity
    /// </summary>
    [DataContract(Name = "VerifyPhotoIdWithSelfieResponse_entity")]
    public partial class VerifyPhotoIdWithSelfieResponseEntity : IEquatable<VerifyPhotoIdWithSelfieResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VerifyPhotoIdWithSelfieResponseEntity" /> class.
        /// </summary>
        /// <param name="selfie">selfie.</param>
        public VerifyPhotoIdWithSelfieResponseEntity(VerifyPhotoIdWithSelfieResponseEntitySelfie selfie = default(VerifyPhotoIdWithSelfieResponseEntitySelfie))
        {
            this.Selfie = selfie;
        }

        /// <summary>
        /// Gets or Sets Selfie
        /// </summary>
        [DataMember(Name = "selfie", EmitDefaultValue = false)]
        public VerifyPhotoIdWithSelfieResponseEntitySelfie Selfie { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VerifyPhotoIdWithSelfieResponseEntity {\n");
            sb.Append("  Selfie: ").Append(Selfie).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as VerifyPhotoIdWithSelfieResponseEntity);
        }

        /// <summary>
        /// Returns true if VerifyPhotoIdWithSelfieResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of VerifyPhotoIdWithSelfieResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VerifyPhotoIdWithSelfieResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Selfie == input.Selfie ||
                    (this.Selfie != null &&
                    this.Selfie.Equals(input.Selfie))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Selfie != null)
                {
                    hashCode = (hashCode * 59) + this.Selfie.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
